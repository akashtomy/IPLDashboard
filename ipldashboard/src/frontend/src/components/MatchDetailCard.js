import {React}  from 'react';

export  const MatchDetailCard =  ({match}) => {
  if(!match) return null;
  return (
    <div className="MatchDetailCard">
      <header>
        <h1>Latest Matches</h1>
       <h3>Match Details</h3>
      <b>{match.team1} v/s {match.team2}</b>
      </header>
    </div>
  );
}

